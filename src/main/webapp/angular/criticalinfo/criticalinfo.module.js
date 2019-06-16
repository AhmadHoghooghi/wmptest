angular.module('wmptest.criticalinfo',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/criticalinfo/criticalinfo.controllers.js'
    ,'/wmptest/angular/criticalinfo/criticalinfo.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/criticalinfo/list', {templateUrl: '/wmptest/angular/criticalinfo/criticalinfo.list.html', controller: 'CriticalinfoListCtrl'})
      .when('/wmptest/criticalinfo/edit', {templateUrl: '/wmptest/angular/criticalinfo/criticalinfo.edit.html', controller: 'CriticalinfoEditCtrl'})
      .when('/wmptest/criticalinfo/edit/:id', {templateUrl: '/wmptest/angular/criticalinfo/criticalinfo.edit.html', controller: 'CriticalinfoEditCtrl'})
      .when('/wmptest/criticalinfo/display/:id', {templateUrl: '/wmptest/angular/criticalinfo/criticalinfo.display.html', controller: 'CriticalinfoDisplayCtrl'})
      	
  }]);
