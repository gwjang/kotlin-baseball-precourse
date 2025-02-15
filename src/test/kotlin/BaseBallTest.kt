import io.kotest.core.spec.style.FeatureSpec

//- 통합
//    - 1스트라이크 테스트
//    - 1볼 1스트라이크 테스트
//    - 낫싱 테스트
//    - 잘못된 입력 테스트
//- 단위
//    - 입력
//    - 스트라이크 볼 체크 함수(리턴은 스트라이크 몇개인지, 볼 몇개인지)

class BaseBallTest: FeatureSpec({
    feature("BaseBall") {
        scenario("1 스트라이크 테스트") {
            val baseBall = BaseBall()
        }
        scenario("1볼 1스트라이크 테스트") {
            val baseBall = BaseBall()
        }
        scenario("낫싱 테스트") {
            val baseBall = BaseBall()
        }
        scenario("잘못된 입력 테스트") {
            val baseBall = BaseBall()
        }
    }
})
