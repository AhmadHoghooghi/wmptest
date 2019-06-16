angular.module('wmptest.fieldvalidation',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/fieldvalidation/fieldvalidation.controllers.js'
    ,'/wmptest/angular/fieldvalidation/fieldvalidation.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/fieldvalidation/list', {templateUrl: '/wmptest/angular/fieldvalidation/fieldvalidation.list.html', controller: 'FieldvalidationListCtrl'})
      .when('/wmptest/fieldvalidation/edit', {templateUrl: '/wmptest/angular/fieldvalidation/fieldvalidation.edit.html', controller: 'FieldvalidationEditCtrl'})
      .when('/wmptest/fieldvalidation/edit/:id', {templateUrl: '/wmptest/angular/fieldvalidation/fieldvalidation.edit.html', controller: 'FieldvalidationEditCtrl'})
      .when('/wmptest/fieldvalidation/display/:id', {templateUrl: '/wmptest/angular/fieldvalidation/fieldvalidation.display.html', controller: 'FieldvalidationDisplayCtrl'})
      	
  }]);
