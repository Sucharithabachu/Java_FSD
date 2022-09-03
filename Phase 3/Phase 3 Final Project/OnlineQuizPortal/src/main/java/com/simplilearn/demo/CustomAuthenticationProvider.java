package com.simplilearn.demo;

import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomAuthenticationProvider implements AuthenticationProvider {
    
	List<User> obj = new ArrayList<User>();
  
    public CustomAuthenticationProvider() {
        obj.add(new User("Suchi", "Cherry26", "ROLE_ADMIN"));
    }
	
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    	
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();

        Optional<User> authenticatedUser =  obj.stream().filter(
                user -> user.getName().equals(name) && user.getPassword().equals(password)
        ).findFirst();

        if(!authenticatedUser.isPresent()){
            throw new BadCredentialsException("Invalid Credentials");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(authenticatedUser.get().getRole()));
        Authentication auth = new UsernamePasswordAuthenticationToken(name, password, authorities);
        return auth;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}