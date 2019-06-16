angular.module('wmptest.company')
    .controller('CompanyEditCtrl', ['$scope', 'CompanyResource', 'wmptestControllerService', function ($scope, CompanyResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'company', CompanyResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('CompanyListCtrl', ['$scope', 'CompanyResource', 'wmptestControllerService', function ($scope, CompanyResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'company', CompanyResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('CompanyDisplayCtrl', ['$scope', '$location', '$routeParams', 'CompanyResource', 'wmptestControllerService', function ($scope, $location, $routeParams, CompanyResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'company', CompanyResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
