import extensions.addProductFlavours

plugins {
    id("commons.android-library")
}

android {
    addProductFlavours(this)
}

dependencies {
    implementation(project(BuildModules.UI))
    implementation(project(BuildModules.Features.ProfileShared))
}