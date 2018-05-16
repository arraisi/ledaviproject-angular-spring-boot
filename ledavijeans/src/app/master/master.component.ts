import { Component, OnInit } from '@angular/core';
import { MasterCustomer, MasterProduct } from './master.model';
import { MasterService } from './master.service';

@Component({
  selector: 'app-master',
  templateUrl: './master.component.html'
})
export class MasterComponent implements OnInit {

  allCustomer: MasterCustomer[];
  allProduct: MasterProduct[];

  constructor(private _service: MasterService) {
    this.allCustomer = [];
    this.allProduct = [];
  }

  loadCustomer() {
    this._service.getAllCustomer().subscribe((dataResponse: MasterCustomer[]) => { this.allCustomer = dataResponse; });
  }
  loadProduct() {
    this._service.getAllProduct().subscribe((dataResponse: MasterProduct[]) => { this.allProduct = dataResponse; });
  }
  // SAVE DATA
  saveCustomer(customer) {
    if (customer.name && customer.address) {
      this._service.saveCustomer(customer).subscribe(dataRespon => { console.log(customer); this.loadCustomer(); }, error => {
        console.log(error);
      });
    }

  }
  saveProduct(product) {
    if (product.name && product.price) {
      this._service.saveProduct(product).subscribe(dataRespon => { console.log(product); this.loadProduct(); }, error => {
        console.log(error);
      });
    }
  }
  deleteCustomer(customer) {
    this._service.deleteCustomer(customer).subscribe(dataReson => { console.log(customer); this.loadCustomer(); });
  }
  deleteProduct(product) {
    this._service.deleteProduct(product).subscribe(dataReson => { console.log(product); this.loadProduct(); });
  }

  ngOnInit() {
    // SELECT DATA
    this.loadCustomer();
    this.loadProduct();
  }

}
