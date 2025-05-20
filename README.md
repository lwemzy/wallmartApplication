# Android Login Screen UI

This repository contains the layout XML code for a **simple and clean login screen UI** for an Android application.

## 🖼️ Preview

> This layout includes:
- A centered logo image
- A title text
- Email and password input fields
- "Forgot password" link
- Login button
- Option to create a new account

## 📁 File Overview

### `res/layout/activity_main.xml`

This layout uses a vertical `LinearLayout` as the root, which contains:
- `ImageView` for the logo (`@drawable/wallmart`)
- `TextView` for the title (`@string/title`)
- Email and password input sections with `EditText` fields
- A "Forgot Password" clickable `TextView`
- A `RelativeLayout` holding:
  - Login `Button`
  - "No Account?" text
  - Sign-up `Button`

### 📏 Dimensions and Resources
- Logo and title size defined in `res/values/dimens.xml` (e.g., `@dimen/logo_w`, `@dimen/logo_h`, `@dimen/title`)
- Strings are externalized in `res/values/strings.xml`
- Custom drawable resources like borders and backgrounds (`@drawable/btn_bordered`, `@color/blue`, `@color/white`)

## 🛠️ Customization

You can easily customize:
- Logo by replacing `@drawable/wallmart`
- Text content in `strings.xml`
- Colors and styles from `colors.xml` and `drawable/`
- Padding and margins from `dimens.xml`

## 📱 Intended Usage

This layout is intended for use as a **Login screen** for Android apps. You can wire up this UI to your `MainActivity.java` or `MainActivity.kt` logic.

## 🔧 How to Use

1. Copy the XML code into your `res/layout/activity_main.xml`
2. Make sure to create or modify:
   - `strings.xml`
   - `colors.xml`
   - `dimens.xml`
   - Drawable resources (e.g., borders, backgrounds)
3. Hook up button listeners and input handling in your activity.

