# Entrevoisin - Yohan Sakref

Ce dépôt contient une mini-application pour le P3 du parcours **Grande École du Numérique**.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


## Running the tests

To run the test you have to run "NeighbourListTest" or "NeighbourServiceTest" you can locate them here :

```
- com.openclassrooms.entrevoisins
	--> neighbour_list 
		--> NeighbourListTest
- com.openclassrooms.entrevoisins.service
	--> NeighbourServiceTest
		
```

### Break down into end to end tests

With this 2 class of test we regroup all the tests we need for all of our functionnality

List of test in **NeighbourListTest**

* 1st Test : This test perform the fact that the screen of the details of the user is well launch on the click of a neighbour.
```
myNeighbourList_ClickOnContact_ShouldLaunchUsersDetails
```

* 2nd Test : This test should verify if the username of the user is the good one while clicking on a neighbour.
```
myNeighbourList_ClickOnContact_ShouldDisplayUsername
```

* 3rd Test : This test should verify after the click on the delete button if the neighbour is well removed.
```
myNeighboursList_deleteAction_shouldRemoveItem
```

* 4th Test : This test should verify if in the fav tab only the favorite user are display.
```
myNeighboursList_deleteAction_shouldRemoveItem
```

## Deployment

To deploy the app follow the below instructions : 

```
- Open the project on Android Studio
- click on "Build" in the top tab
- and then "Build APK(s)"
```

If you want to just start the application, you can simply launch it trough the start button after selecting "app"

## Built With

* [ButterKnife](https://jakewharton.github.io/butterknife/) - Used to bindView from the interface to the code app
* [Gradle](https://gradle.org/) - Dependency Management
* [Espresso](https://developer.android.com/training/testing/espresso) - Used to performe the test
* [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android focused on smooth scrolling
* [EventBus](https://github.com/greenrobot/EventBus) - Used to simplifies communication between Activities, Fragments, Threads, Services, etc.

## Contributing

Sorry but you can't contribute as this is my project to validate my formation in OpenClassrooms.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Yohan Sakref** - *Initial work* - [Sakrefyohan](https://github.com/Sakrefyohan)

## Acknowledgments

* thanks to my mentor who help me to achieve this project.
