import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MasterCustomer, MasterProduct } from './master.model';

@Injectable()
export class MasterService {
    constructor(private _http: HttpClient) { }

    getCustomer(idCustomer: number) {
        return this._http.get(`/ledavi/customer/${idCustomer}`);
    }
    getAllCustomer() {
        return this._http.get('/ledavi/customer/');
    }
    saveCustomer(customer: MasterCustomer) {
        return this._http.post('/ledavi/customer/', customer);
    }
    updateCustomer(customer: MasterCustomer) {
        return this._http.put('/ledavi/customer/', customer);
    }
    deleteCustomer(idCustomer: number) {
        return this._http.delete(`/ledavi/customer/${idCustomer}`);
    }

    // SERVICE FOR PRODUCT

    getProduct(idProduct: number) {
        return this._http.get(`/ledavi/product/${idProduct}`);
    }
    getAllProduct() {
        return this._http.get('/ledavi/product/');
    }
    saveProduct(product: MasterProduct) {
        return this._http.post('/ledavi/product/', product);
    }
    updateProduct(product: MasterProduct) {
        return this._http.put('/ledavi/product/', product);
    }

    deleteProduct(idProduct: number) {
        return this._http.delete(`/ledavi/product/${idProduct}`);
    }
}
