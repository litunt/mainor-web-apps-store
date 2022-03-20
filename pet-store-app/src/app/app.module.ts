import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatMenuModule } from '@angular/material/menu';
import { MatCardModule } from '@angular/material/card';
import { MatGridListModule } from '@angular/material/grid-list';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import { ProductCardComponent } from './components/products/product-card/product-card.component';
import { CategoryCardComponent } from './components/categories/category-card/category-card.component';
import { CategoriesComponent } from './components/categories/categories.component';
@NgModule({
  declarations: [
    AppComponent,
    ProductCardComponent,
    CategoryCardComponent,
    CategoriesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSliderModule,
    MatButtonModule,
    MatToolbarModule,
    MatIconModule,
    MatMenuModule,
    MatCardModule,
    MatGridListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
