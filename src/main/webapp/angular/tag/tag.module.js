angular.module('wmptest.tag',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/tag/tag.controllers.js'
    ,'/wmptest/angular/tag/tag.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/tag/list', {templateUrl: '/wmptest/angular/tag/tag.list.html', controller: 'TagListCtrl'})
      .when('/wmptest/tag/edit', {templateUrl: '/wmptest/angular/tag/tag.edit.html', controller: 'TagEditCtrl'})
      .when('/wmptest/tag/edit/:id', {templateUrl: '/wmptest/angular/tag/tag.edit.html', controller: 'TagEditCtrl'})
      .when('/wmptest/tag/display/:id', {templateUrl: '/wmptest/angular/tag/tag.display.html', controller: 'TagDisplayCtrl'})
      	
  }]);
