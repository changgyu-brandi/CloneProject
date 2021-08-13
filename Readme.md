구현중 이슈

FragmentContainerView에 app:navGraph="@navigation/nav_home”으로 지정해서
gnb로 화면이동을 하면 화면이 overlap되는 현상

하지만 app:navGraph 쓰지 않으면 findNavController()에서 graph id가 null 이어서 
findNavController().navigate()할때 java.lang.IllegalStateException: no current navigation node
에러가 남. naviagete()하려면 루트에 있는 navController로 직업 navigate()를 호출해야 하는데
이부분에 대한 이해가 더 필요

마미 프로젝트를 보면 xml에 app:navGraph쓰지 않고 사용하는데 findNavController().navigate()를
사용해도 잘 동작한다. 이 차이를 알아야 될거같다.


탭 레이아웃의 넓이가 고정된 크기로 그려진다.(wrap_content or match_parent)

spanSizeOverride 제대로 동작안한다.
override fun getSpanSize(position: Int): Int {
    if(position==0) return 2
    else return 1
}
를 직접 정의하면 제대로 동작
