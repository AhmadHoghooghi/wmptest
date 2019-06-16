angular.module('wmptest.engine')
    .controller('EngineEditCtrl', ['$scope', 'EngineResource', 'wmptestControllerService', function ($scope, EngineResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'engine', EngineResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('EngineListCtrl', ['$scope', 'EngineResource', 'wmptestControllerService', function ($scope, EngineResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'engine', EngineResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('EngineDisplayCtrl', ['$scope', '$location', '$routeParams', 'EngineResource', 'wmptestControllerService', function ($scope, $location, $routeParams, EngineResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'engine', EngineResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
