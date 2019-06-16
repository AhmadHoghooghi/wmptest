angular.module('wmptest.engine',['ngRoute',
   ['/wmptest/angular/lib.js'
    ,'/wmptest/angular/engine/engine.controllers.js'
    ,'/wmptest/angular/engine/engine.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/wmptest/engine/list', {templateUrl: '/wmptest/angular/engine/engine.list.html', controller: 'EngineListCtrl'})
      .when('/wmptest/engine/edit', {templateUrl: '/wmptest/angular/engine/engine.edit.html', controller: 'EngineEditCtrl'})
      .when('/wmptest/engine/edit/:id', {templateUrl: '/wmptest/angular/engine/engine.edit.html', controller: 'EngineEditCtrl'})
      .when('/wmptest/engine/display/:id', {templateUrl: '/wmptest/angular/engine/engine.display.html', controller: 'EngineDisplayCtrl'})
      	
  }]);
