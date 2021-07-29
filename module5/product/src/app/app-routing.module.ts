import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';


const routes: Routes = [
  {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'product/list',
    component: ProductListComponent
  },
  {
    path: 'product/edit/:id',
    component: ProductEditComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
