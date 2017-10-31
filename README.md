# SpringFabMenu
---

A menu of `FloatingActionButton` items, designed to be anchored on an `AppBarLayout`.

![alt text](spring-fab-menu.gif "Example")

### Usage

---

[ ![Download](https://api.bintray.com/packages/ranyalbegwein/maven/spring-fab-menu/images/download.svg) ](https://bintray.com/ranyalbegwein/maven/spring-fab-menu/_latestVersion)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-SpringFabMenu-green.svg?style=flat )]( https://android-arsenal.com/details/1/6384 )

1. Edit your *build.gradle* to include the library and sync.

```
dependencies {
    compile 'com.rany.albeg.wein:spring-fab-menu:1.0.1'
}
```
Or with Maven:
```xml
<dependency>
  <groupId>com.rany.albeg.wein</groupId>
  <artifactId>spring-fab-menu</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
2. Create a `SpringFabMenu` in XML:
```xml
    <com.rany.albeg.wein.springfabmenu.SpringFabMenu
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_anchor="@id/app_bar"
        app:layout_anchorGravity="bottom|left"
        app:layout_behavior="@string/appbar_springfabmenu_behavior">

        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab_1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fabSize="mini"/>

        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab_2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fabSize="mini"/>

        <android.support.design.widget.FloatingActionButton
            android:id="@+id/fab_3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fabSize="mini"/>

    </com.rany.albeg.wein.springfabmenu.SpringFabMenu>
```

All available attributes ( following values are defaults ):
```xml
    <com.rany.albeg.wein.springfabmenu.SpringFabMenu
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:layout_anchor="@id/app_bar"
        app:layout_anchorGravity="bottom|left"
        app:layout_behavior="@string/appbar_springfabmenu_behavior"
        app:sfm_collapse_duration="1000"
        app:sfm_collapse_on_item_selected="true"
        app:sfm_delay_expanding_menu_items="250"
        app:sfm_expand_duration="1000"
        app:sfm_expand_item_rotation_degrees="360"
        app:sfm_expand_menu_button_rotation_degrees="405"
        app:sfm_menu_button_color="@color/colorAccent"
        app:sfm_menu_button_ripple_color="#11000000"
        app:sfm_size_menu_button="normal"
        app:sfm_spacing_menu_items="15dp"
        app:sfm_src_icon="@drawable/ic_action_add">
```

* `app:sfm_collapse_duration` : The time ( in ms ) it takes for the menu to collapse.
* `app:sfm_collapse_on_item_selected` : Will the menu collapse when a menu-item is clicked.
* `app:sfm_delay_expanding_menu_items` : Delay ( in ms ) between expanding menu items.
* `app:sfm_expand_duration` : The time ( in ms ) it takes for the menu to expand.
* `app:sfm_expand_item_rotation_degrees` : Degrees of rotation for expanding menu item.
* `app:sfm_expand_menu_button_rotation_degrees` : Degrees of rotation for the menu button.
* `app:sfm_menu_button_color` : The color of the menu button.
* `app:sfm_menu_button_ripple_color` : The ripple color of the menu button.
* `app:sfm_size_menu_button` : The size of the menu button.
* `app:sfm_spacing_menu_items` : Spacing ( in dp ) between menu items.
* `app:sfm_src_icon` : The icon for the menu button.

**Note:**
If you decide to anchor `SpringFabMenu` to an `AppBarLayout`, don't forget to apply a behavior to hide or show the menu:

`app:layout_behavior="@string/appbar_springfabmenu_behavior"`

3. Listen for item clicks:

```java
SpringFabMenu sfm = (SpringFabMenu)findViewById(R.id.sfm);
        
sfm.setOnSpringFabMenuItemClickListener(new SpringFabMenu.OnSpringFabMenuItemClickListener() {
	@Override
	public void onSpringFabMenuItemClick(View view) {
		switch (view.getId()) {
			case R.id.fab_share:
				break;
			case R.id.fab_send:
				break;
			case R.id.fab_delete:
		}
	}
});
```

AUTHOR
-------

**Rany Albeg Wein**


LICENSE
--------
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

