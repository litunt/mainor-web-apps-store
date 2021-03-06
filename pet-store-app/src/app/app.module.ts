import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import {HttpClientModule} from '@angular/common/http';
import { MatMenuModule } from '@angular/material/menu';
import { MatListModule } from '@angular/material/list';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card';
import { MatGridListModule } from '@angular/material/grid-list';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import { ProductCardComponent } from './components/products/product-card/product-card.component';
import { CategoryCardComponent } from './components/categories/category-card/category-card.component';
import { CategoriesComponent } from './components/categories/categories.component';
import { ContactPageComponent } from './components/contact-page/contact-page.component';
import { ProductsComponent } from './components/products/products.component';
import {ProductService} from "./service/product.service";
import {CartService} from "./service/cart.service";
import { ShoppingCartComponent } from './components/shopping-cart/shopping-cart.component';
import {OrderService} from "./service/order.service";
import { OrderPageComponent } from './components/order-page/order-page.component';
@NgModule({
  declarations: [
    AppComponent,
    ProductCardComponent,
    CategoryCardComponent,
    CategoriesComponent,
    ContactPageComponent,
    ProductsComponent,
    ShoppingCartComponent,
    OrderPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatSliderModule,
    MatButtonModule,
    MatToolbarModule,
    MatIconModule,
    MatMenuModule,
    MatCardModule,
    MatGridListModule,
    MatTableModule,
    MatFormFieldModule,
    MatInputModule,
    MatListModule
  ],
  exports: [
    RouterModule,
    MatTableModule
  ],
  providers: [
    ProductService,
    CartService,
    OrderService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
