angular.module('wmptest.messagetype',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/messagetype/messagetype.controllers.js'
    ,'/wmptest/angular/messagetype/messagetype.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/messagetype/list', {templateUrl: '/wmptest/angular/messagetype/messagetype.list.html', controller: 'MessagetypeListCtrl'})
      .when('/wmptest/messagetype/edit', {templateUrl: '/wmptest/angular/messagetype/messagetype.edit.html', controller: 'MessagetypeEditCtrl'})
      .when('/wmptest/messagetype/edit/:id', {templateUrl: '/wmptest/angular/messagetype/messagetype.edit.html', controller: 'MessagetypeEditCtrl'})
      .when('/wmptest/messagetype/display/:id', {templateUrl: '/wmptest/angular/messagetype/messagetype.display.html', controller: 'MessagetypeDisplayCtrl'})
      	
  }]);
