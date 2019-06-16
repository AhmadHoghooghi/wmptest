angular.module('wmptest.company',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/company/company.controllers.js'
    ,'/wmptest/angular/company/company.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/company/list', {templateUrl: '/wmptest/angular/company/company.list.html', controller: 'CompanyListCtrl'})
      .when('/wmptest/company/edit', {templateUrl: '/wmptest/angular/company/company.edit.html', controller: 'CompanyEditCtrl'})
      .when('/wmptest/company/edit/:id', {templateUrl: '/wmptest/angular/company/company.edit.html', controller: 'CompanyEditCtrl'})
      .when('/wmptest/company/display/:id', {templateUrl: '/wmptest/angular/company/company.display.html', controller: 'CompanyDisplayCtrl'})
      	
  }]);
