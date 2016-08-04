# justify-layout
JustifyLayout will arrange child elements horizontally with the same margin between them.

If there is not enough space for next view new line will be added.

## Usage
`git clone https://github.com/ahmadmuzakki29/justify-layout`

then on **Android Studio** you can import the module with **File**->**New**->**Import Module** and choose module **:justifylayout** inside downloaded folder

### Quick snippet : 
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >
    <com.muzakki.ahmad.layout.JustifyLayout
        xmlns:app="http://schemas.android.com/apk/res-auto"
        app:verticalSpacing="30dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:color/holo_red_light"
        >
        <button
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:text="Button 1"
        />
        <button
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:text="Button 2"
        />
        <button
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:text="Button 3"
        />
        <button
        android:layout_height="wrap_content"
        android:layout_width="wrap_content"
        android:text="Button 4"
        />
    </com.muzakki.ahmad.layout.JustifyLayout>
</ScrollView>
```

### Potrait preview

![alt text][potrait]

[potrait]: https://raw.githubusercontent.com/ahmadmuzakki29/justify-layout/master/justifylayout/src/main/res/drawable/potrait.png "Potrait"


### Landscape preview 

![alt text][landscape]

[landscape]: https://raw.githubusercontent.com/ahmadmuzakki29/justify-layout/master/justifylayout/src/main/res/drawable/landscape.png "Landscape"

#### Gravity support
you can put `android:gravity="left"` or `android:gravity="right"` to align the last line of item. default is `center_horizontal`
```xml
    <com.muzakki.ahmad.layout.JustifyLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="right"
        android:background="@android:color/holo_red_light"
        />
```
#### Result
![alt text](https://raw.githubusercontent.com/ahmadmuzakki29/justify-layout/master/justifylayout/src/main/res/drawable/align_right.png "Align right")
