package kr.co.essolution.ch02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* 코틀린 개발 환경
    0. 빌드 도구
        - 앤드(Ant), 메이븐(Maven). 그레이들 등
        - 개발자가 만든 코드를 컴파일 하고 패키징
        - 라이브러리 의존성 표현
        - 안드로이드 스튜디오나 InttlliJ에서는 기본적인 빌드 도구로 그레이들 제공
        - 자바 서버 측 웹애플리케이션 개발시 메이즌(Manve)이 많이 사용 되던 도구 임
    1. IntelliJ -> 가장 일반적인 개발 환경
    2. 안드로이드 스튜디오
    3. 이클립스
    4. CLI(Command Line Interface) :

 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
