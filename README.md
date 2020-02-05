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

1st Test : 

This test perform the fact that the screen of the details of the user is well launch on the click of a neighbour.

2nd Test : 

This test should verify if the username of the user is the good one while clicking on a neighbour.

3rd Test : 

This test should verify after the click on the delete button if the neighbour is well removed.

4th Test : 

This test should verify if in the fav tab only the favorite user are display.
```
1st - myNeighbourList_ClickOnContact_ShouldLaunchUsersDetails
2nd - myNeighbourList_ClickOnContact_ShouldDisplayUsername
3rd - myNeighboursList_deleteAction_shouldRemoveItem
4th - myNeighboursList_deleteAction_shouldRemoveItem
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

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
