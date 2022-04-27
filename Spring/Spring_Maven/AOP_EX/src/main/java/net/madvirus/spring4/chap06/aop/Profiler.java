package net.madvirus.spring4.chap06.aop;

import org.aspectj.lang.ProceedingJoinPoint;

// 이 클래스는 공통기능 클래스를 의미한다
public class Profiler {

	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed(); // 핵심 로직 실행
			return result;
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행 시간 : " +
					(finish - start) + "ms");
		}
	}

}