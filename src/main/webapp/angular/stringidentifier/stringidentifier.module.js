angular.module('wmptest.stringidentifier',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/stringidentifier/stringidentifier.controllers.js'
    ,'/wmptest/angular/stringidentifier/stringidentifier.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/stringidentifier/list', {templateUrl: '/wmptest/angular/stringidentifier/stringidentifier.list.html', controller: 'StringidentifierListCtrl'})
      .when('/wmptest/stringidentifier/edit', {templateUrl: '/wmptest/angular/stringidentifier/stringidentifier.edit.html', controller: 'StringidentifierEditCtrl'})
      .when('/wmptest/stringidentifier/edit/:id', {templateUrl: '/wmptest/angular/stringidentifier/stringidentifier.edit.html', controller: 'StringidentifierEditCtrl'})
      .when('/wmptest/stringidentifier/display/:id', {templateUrl: '/wmptest/angular/stringidentifier/stringidentifier.display.html', controller: 'StringidentifierDisplayCtrl'})
      	
  }]);
