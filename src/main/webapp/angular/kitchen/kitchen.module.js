angular.module('wmptest.kitchen',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/kitchen/kitchen.controllers.js'
    ,'/wmptest/angular/kitchen/kitchen.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/kitchen/list', {templateUrl: '/wmptest/angular/kitchen/kitchen.list.html', controller: 'KitchenListCtrl'})
      .when('/wmptest/kitchen/edit', {templateUrl: '/wmptest/angular/kitchen/kitchen.edit.html', controller: 'KitchenEditCtrl'})
      .when('/wmptest/kitchen/edit/:id', {templateUrl: '/wmptest/angular/kitchen/kitchen.edit.html', controller: 'KitchenEditCtrl'})
      .when('/wmptest/kitchen/display/:id', {templateUrl: '/wmptest/angular/kitchen/kitchen.display.html', controller: 'KitchenDisplayCtrl'})
      	
  }]);
