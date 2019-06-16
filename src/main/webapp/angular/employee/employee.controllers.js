angular.module('wmptest.employee')
    .controller('EmployeeEditCtrl', ['$scope', 'EmployeeResource', 'wmptestControllerService', function ($scope, EmployeeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'employee', EmployeeResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('EmployeeListCtrl', ['$scope', 'EmployeeResource', 'wmptestControllerService', function ($scope, EmployeeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'employee', EmployeeResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('EmployeeDisplayCtrl', ['$scope', '$location', '$routeParams', 'EmployeeResource', 'wmptestControllerService', function ($scope, $location, $routeParams, EmployeeResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'employee', EmployeeResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
