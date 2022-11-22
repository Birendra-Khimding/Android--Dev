# Android -Dev
 Game- Match Pairs

                                                              Match Paris

Match Pairs. It is a classic memory game in which the user flip over the images and try to find the matching pair. 
To build this project, we have used multiple Activities and Recycle view. 

UI Design

<img src="https://user-images.githubusercontent.com/118632127/203396143-c8e73d92-78f8-4e05-a863-40a6dccf20fe.png" width="250" height="500" />

* The MainActivity opens the main UI which has the navigation/option for the game. This activity has a Constraint Layout which holds two text views and three button named Easy, Medium, Hard. The buttons are set to setOnClickListener, so that when the user press/click on the button, it opens new individual Activity.
<img src="https://user-images.githubusercontent.com/118632127/203396950-c719255f-7b19-42ba-be4a-b92cfa3820f3.png" width="1000" height="300" />

* Dublicating and suffiling images
<img src="https://user-images.githubusercontent.com/118632127/203398827-de320226-9f81-4209-8c24-f074ee11e2e7.png" width="1000" height="300" />

* Data class which holdes the data/image state of the imageButton
<img src="https://user-images.githubusercontent.com/118632127/203399173-2b91773e-5d90-4f3a-8fae-b46f6723e0f1.png" width="1000" height="300" />

* All the activity uses the same Recycle view adapter class. The recycle view has a constructor which take in the perimeter of the number of images, images, row and
  column
<img src="https://user-images.githubusercontent.com/118632127/203399678-f5b31f6f-8aa8-4d48-8b97-b46471d9afda.png" width="1000" height="300" />
  
* Game logic
<img src="https://user-images.githubusercontent.com/118632127/203399882-72135d52-d2e4-476b-b01c-d6941d61d505.png" width="1000" height="650" />

