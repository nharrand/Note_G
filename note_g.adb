with Ada.Text_IO;
use Ada.Text_IO;

procedure Note_G is
	I : Integer := 5;
	O : Float := 0.0;

	function Expected (Input : Integer) return Float is
		B : array (0 .. 16) of Float;
	begin
		B(0) := 1.0;
		B(1) := -1.0/2.0;
		B(2) := 1.0/6.0;
		B(3) := 0.0;
		B(4) := -1.0/30.0;
		B(5) := 0.0;
		B(6) := 1.0/42.0;
		B(7) := 0.0;
		B(8) := -1.0/30.0;
		B(9) := 0.0;
		B(10) := 5.0/66.0;
		B(11) := 0.0;
		B(12) := -691.0/2730.0;
		B(13) := 0.0;
		B(14) := 7.0/6.0;
		B(15) := 0.0;
		B(16) := -3617.0/510.0;
		return B(Input);
	end Expected;




	function Bernouilli (Input : Integer) return Float is
		V1 : Float := 1.0;
		V2 : Float := 2.0;
		V3 : Float := 0.0;
		V4 : Float := 0.0;
		V5 : Float := 0.0;
		V6 : Float := 0.0;
		V7 : Float := 0.0;
		V8 : Float := 0.0;
		V9 : Float := 0.0;
		V10 : Float := 0.0;
		V11 : Float := 0.0;
		V12 : Float := 0.0;
		V13 : Float := 0.0;
		V14 : Float := 0.0;
		V15 : Float := 0.0;
		V16 : Float := 0.0;
		V17 : Float := 0.0;
		V18 : Float := 0.0;
		V19 : Float := 0.0;
		V20 : Float := 0.0;
		V21 : Float := 1.0 / 6.0;
		V22 : Float := -1.0 / 30.0;
		V23 : Float := 0.0;
		V24 : Float := 0.0;
	begin
		V24 := 0.0;
		V3  := Float(Input);

		V4  := V2  * V3;  -- 2n
		V5  := V2  * V3;
		V6  := V2  * V3;
		V4  := V4  - V1;  -- 2n - 1
		V5  := V5  + V1;  -- 2n + 1
		V11 := V4  / V5;  -- (2n-1)/(2n+1)
		V4  := 0.0;
		V5  := 0.0;
		V13 := V11 / V2;  -- (2n-1)/(2n+1)/2
		V13 := V13 - V11; -- A0 = - ...
		V11 := 0.0;
		V10 := V3  - V1;  -- n-1 = 3
		V7  := V2  + V7;  -- 2+0 = 2, i.e. V2 -> V7
		V11 := V6  / V7;  -- A1 = 2n/2 = Aj
		V12 := V21 * V11; -- B1*A1
		V13 := V12 + V13; -- V12 -> V13: x = V12
		V12 := 0.0;
		V10 := V10 - V1;  -- j-1 = 2
		<<LOOP_START>>
		V6  := V6  - V1;  -- 2n-1
		V7  := V1  + V7;  -- 2+1=3 (j)
		V8  := V6  / V7;  -- (2n-1)/3
		V11 := V8  * V11; -- Aj * (2n-1)/3
		V8  := 0.0;
		V6  := V6  - V1;  -- 2n-2
		V7  := V1  + V7;  -- 3+1=4 (j+1)
		V9  := V6  / V7;  -- (2n-2)/4
		V11 := V9  * V11; -- Aj * (2n-2)/4 -> Aj = A3
		V9 	:= 0.0;
		V12 := V22 * V11; -- A3 * B3
		--V11 := 0.0;
		V13 := V12 + V13; -- x + A3*B3 -> x
		V12 := 0.0;
		V10 := V10 - V1;  -- j-1 = 1
		if ( V10 > 1.0 ) then
			Put_Line("goto");
			goto LOOP_START;
		end if;
		V24 := V24 - V13; -- B7 = -x
		V3  := V1  + V3;  -- n+1 -> n


		V6  := 0.0;
		V7  := 0.0;




		Put_Line("V1=" & Float'Image(V1) & ", V2=" & Float'Image(V2) & ", V3=" & Float'Image(V3) & ", V4=" & Float'Image(V4) & ", V5=" & Float'Image(V5) & ", V6=" & Float'Image(V6));
		Put_Line("V7=" & Float'Image(V7) & ", V8=" & Float'Image(V8) & ", V9=" & Float'Image(V9) & ", V10=" & Float'Image(V10) & ", V11=" & Float'Image(V11) & ", V12=" & Float'Image(V12));
		Put_Line("V13=" & Float'Image(V13) & ", V14=" & Float'Image(V14) & ", V15=" & Float'Image(V15) & ", V16=" & Float'Image(V16) & ", V17=" & Float'Image(V17) & ", V18=" & Float'Image(V18));
		Put_Line("V19=" & Float'Image(V19) & ", V20=" & Float'Image(V20) & ", V21=" & Float'Image(V21) & ", V22=" & Float'Image(V22) & ", V23=" & Float'Image(V23) & ", V24=" & Float'Image(V24));

		return V24;
	end Bernouilli;

	function Modern (Ne : in Integer) return Float is
		B : array (1 .. 100) of Float;
		N2 : Integer;
		K: Integer;
		A0 : Float;
		A1 : Float;
		Aj : Float;
		X : Float;
	begin
		B(1) := 1.0 / 6.0;
		for n in 2 .. Ne loop
			N2 := 2 * n;
			K := N2 - 1;
			A0 := - (Float(N2) - 1.0) / (Float(N2) + 1.0) / 2.0;
			A1 := Float(N2) / 2.0;
			X := A0 + B(1) * A1;
			AJ := A1;
			for j in 3 .. K-1 loop
				AJ := AJ * Float(n2 - (j-2)) / Float(j);
				AJ := AJ * Float(n2 - (j-1)) / Float(j + 1);
				X := X + B(j) * aj;
			end loop;
			B(k) := -x;
			--Put_Line("b(" & Integer'Image(n+1) & ") " & Float'Image(B(n)));
		end loop;
		return B(Ne);
	end Modern;
begin
	for j in 2..10 loop
		I := j;
		Put_Line("Input      = " & Integer'Image(j));
		Put_Line("Lovelace   = " & Float'Image(Bernouilli(I)));
		Put_Line("Expected   = " & Float'Image(Expected(I)));
		Put_Line("Modern     = " & Float'Image(Modern(I)));
	end loop;
end Note_G;
