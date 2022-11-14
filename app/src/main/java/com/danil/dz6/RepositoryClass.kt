package com.danil.dz6

class RepositoryClass {

        private val galleryList = mutableListOf<GalleryModel>()

        fun getPhotos(): List<GalleryModel> {
            galleryList.add(
                GalleryModel(
                    1,
                    "https://wallpapers.com/images/high/darling-in-the-franxx-lovely-couple-o31g3xt2x8baqsm1.webp"
                )
            )
            galleryList.add(
                GalleryModel(
                    2,
                    "https://i1.7fon.org/thumb/c138271.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    3,
                    "https://abrakadabra.fun/uploads/posts/2022-02/1644208669_1-abrakadabra-fun-p-oboi-kosmos-na-telefon-visokogo-kachestva-1.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    4,
                    "https://i.pinimg.com/originals/0b/48/12/0b48129c806ee6522bf5e180627d457d.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    5,
                    "https://images.wallpaperscraft.ru/image/single/planeta_galaktika_vselennaia_121293_225x300.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    6,
                    "https://abrakadabra.fun/uploads/posts/2022-01/1641230578_1-abrakadabra-fun-p-krasivie-oboi-na-telefon-android-kosmos-2.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    7,
                    "https://celes.club/uploads/posts/2022-06/1654379275_1-celes-club-p-oboi-vertikalnie-kosmos-krasivie-1.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    8,
                    "https://phonoteka.org/uploads/posts/2021-04/1618402961_9-phonoteka_org-p-fon-dlya-telefona-kosmos-9.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    9,
                    "https://i.pinimg.com/564x/7b/a8/87/7ba88742453bacb2a1f078891ccdebbd.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    10,
                    "https://pibig.info/uploads/posts/2022-05/1651871010_1-pibig-info-p-oboi-na-telefon-kosmos-krasivo-1.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    11,
                    "https://i1.7fon.org/thumb/c137572.jpg"
                )
            )
            galleryList.add(
                GalleryModel(
                    12,
                    "https://mobimg.b-cdn.net/v3/fetch/1d/1d979906db0a8d7fb37f32413646941b.jpeg"
                )
            )

            return galleryList
        }
    }
