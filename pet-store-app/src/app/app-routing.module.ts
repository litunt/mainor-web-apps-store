import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CategoriesComponent} from "./components/categories/categories.component";
import {ContactPageComponent} from "./components/contact-page/contact-page.component";
import {ProductsComponent} from "./components/products/products.component";
import {ShoppingCartComponent} from "./components/shopping-cart/shopping-cart.component";
import {OrderPageComponent} from "./components/order-page/order-page.component";

const routes: Routes = [
  {path: '', component: CategoriesComponent},
  {path: 'contact', component: ContactPageComponent},
  {path: 'products', component: ProductsComponent},
  {path: 'shopping-cart', component: ShoppingCartComponent},
  {path: 'order-complete', component: OrderPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
