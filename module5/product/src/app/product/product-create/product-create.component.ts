import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ProductServiceService} from '../../service/product-service.service';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productForm : FormGroup = new FormGroup({
    id : new FormControl("",[Validators.required,Validators.pattern(/^[0-9]$/)]),
    name : new FormControl("",Validators.required),
    price : new FormControl("",Validators.required),
    description : new FormControl("",Validators.required)
  })
  constructor(private productServiceService : ProductServiceService) { }

  ngOnInit(): void {
  }

  create() {
    this.productServiceService.create(this.productForm.value);
    console.log(this.productForm);
  }
}
