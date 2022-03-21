import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CategoriesComponent} from "./components/categories/categories.component";
import {ContactPageComponent} from "./components/contact-page/contact-page.component";

const routes: Routes = [
  {path: '', component: CategoriesComponent},
  {path: 'contact', component: ContactPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
