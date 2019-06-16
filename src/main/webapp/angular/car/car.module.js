angular.module('wmptest.car',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/car/car.controllers.js'
    ,'/wmptest/angular/car/car.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/car/list', {templateUrl: '/wmptest/angular/car/car.list.html', controller: 'CarListCtrl'})
      .when('/wmptest/car/edit', {templateUrl: '/wmptest/angular/car/car.edit.html', controller: 'CarEditCtrl'})
      .when('/wmptest/car/edit/:id', {templateUrl: '/wmptest/angular/car/car.edit.html', controller: 'CarEditCtrl'})
      .when('/wmptest/car/display/:id', {templateUrl: '/wmptest/angular/car/car.display.html', controller: 'CarDisplayCtrl'})
      	
  }]);
