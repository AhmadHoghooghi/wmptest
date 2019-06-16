angular.module('wmptest.home',['ngRoute',
   ['/wmptest/angular/lib.js'
	,'/wmptest/angular/kitchen/kitchen.module.js'
    ,'/wmptest/angular/home/home.controllers.js'
    ,'/wmptest/angular/home/home.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/home/list', {templateUrl: '/wmptest/angular/home/home.list.html', controller: 'HomeListCtrl'})
      .when('/wmptest/home/edit', {templateUrl: '/wmptest/angular/home/home.edit.html', controller: 'HomeEditCtrl'})
      .when('/wmptest/home/edit/:id', {templateUrl: '/wmptest/angular/home/home.edit.html', controller: 'HomeEditCtrl'})
      .when('/wmptest/home/display/:id', {templateUrl: '/wmptest/angular/home/home.display.html', controller: 'HomeDisplayCtrl'})
      	
  }]);
