# OpenClassrooms

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

1st Test : This test perform the fact that the screen of the details of the user is well launch on the click of a neighbour.
```
myNeighbourList_ClickOnContact_ShouldLaunchUsersDetails
```

2nd Test : This test should verify if the username of the user is the good one while clicking on a neighbour.
```
myNeighbourList_ClickOnContact_ShouldDisplayUsername
```

3rd Test : This test should verify after the click on the delete button if the neighbour is well removed.
```
myNeighboursList_deleteAction_shouldRemoveItem
```

4th Test : This test should verify if in the fav tab only the favorite user are display.
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

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
