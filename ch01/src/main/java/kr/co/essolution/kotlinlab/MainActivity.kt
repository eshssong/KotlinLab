package kr.co.essolution.kotlinlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    /* 코틀린의 특징
        1. 자바, 안드로이드와 100% 호환
        2. 자바, 안드로이드, 브라우저, 네이티프 애플리케이션 개발
        3. intellj, 안드로이드 스튜디오, 이클립스, CLI 등을 통한 개발
        4. Null 안정성(Null Safety)
           - Null에 대한 다양한 예외 처리 기능 제공
        5. 확장 함수(Extension)
           - 상속을 통하지 않고, 함수 확장을 통한 기존 클래스의 기능을 쉽게 추가 할 수 있는 최신 트랜드
        6. 함수형 프로그래밍
           - 람다 식이나, 고차 함수를 제공하여 소프트웨어 개발 패러다임 구축
        7. data 클래스
           - 데이터 자체를 표현하기 위해 VO(Value Object) 클래스를 정의하지 않고, 쉽게 작성 할 수 있도록 data 클래스 제공
        8. Immutable 변수
           - 변수를 선언 할 때 mutable과 immutable을 구분
           - 컴파일 단계 부터 변경 할 수 있는 변수 인지를 명식적으로 구분
     */

    /* 코틀린으로 작성 가능한 프로그램
       1. 자바 -> 코틀린
       2. 안드로이드 -> 코틀린
       3. 자바 스크립트 -> 코틀린
       4. 서버 웹 애플리케이션 -> 코틀린
       5. 스크링 부트를 이용한 Restful 서비스 -> 코틀린
     */

    /* gitHub Structure
        Working Directory -> add -> Stage Area -> Commit -> Head(Local Git Reporitory) -> Push -> GitHub(Server)
        1. Add : 관리하려는 목록에 추가
        2. Commit : 관리할 파일들이 확정
        3. Head : 로컬 저장소에 저장
        4. Push : 원격 서버 GitHub에 발행
     */

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}