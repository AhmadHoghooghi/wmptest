angular.module('wmptest.criticalinfo')
    .controller('CriticalinfoEditCtrl', ['$scope', 'CriticalinfoResource', 'wmptestControllerService', function ($scope, CriticalinfoResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'criticalInfo', CriticalinfoResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('CriticalinfoListCtrl', ['$scope', 'CriticalinfoResource', 'wmptestControllerService', function ($scope, CriticalinfoResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'criticalInfo', CriticalinfoResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('CriticalinfoDisplayCtrl', ['$scope', '$location', '$routeParams', 'CriticalinfoResource', 'wmptestControllerService', function ($scope, $location, $routeParams, CriticalinfoResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'criticalInfo', CriticalinfoResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
