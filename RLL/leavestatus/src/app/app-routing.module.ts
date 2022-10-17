import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LeavestatusComponent } from './leavestatus/leavestatus.component';


const routes: Routes = [{path: "leavestatus", component:LeavestatusComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
