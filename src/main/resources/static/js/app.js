var app = angular.module('mainModule', ['ui.bootstrap','ngAnimate', 'ngRoute']);

app.controller('signinController', function ($scope, $http) {


});

app.config(function($routeProvider) {
        $routeProvider

            .when('/Home', {
                templateUrl: '/home',
                controller: 'defaultController'
            })
             .when('/Shortcuts', {
                 templateUrl: '/shortcut',
                 controller: 'shortcutController'
             })
            .otherwise({
                redirectTo : '/Dashboard'
            });
    });

app.controller('defaultController', function ($scope, $rootScope, $http ) {
       $scope.message = 'Look! I am the default page.';
});

app.controller('shortcutController', function ($scope, $rootScope, $http) {
       $scope.message = 'Look! I am the shortcuts page.';
});
