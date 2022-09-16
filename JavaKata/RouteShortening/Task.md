<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">E. Сокращение маршрута</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>1&nbsp;секунда</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>64Mb</td>
         </tr>
         <tr class="input-file">
            <td class="property-title">Ввод</td>
            <td colspan="1">стандартный ввод или input.txt</td>
         </tr>
         <tr class="output-file">
            <td class="property-title">Вывод</td>
            <td colspan="1">стандартный вывод или output.txt</td>
         </tr>
      </tbody></table>
   </div>
   <h2></h2>
   <div class="legend"><span style="">
         <p>Вам поручили дойти из точки А в точку Б.<br></p></span><p>Предыдущий путешественник по этому маршруту оставил вместо карты краткое описание маршрута с направлениями движения и дистанциями.
         Однако у него на пути были промежуточные точки, из-за чего в описании встречаются тупики. Вам очень хочется вовремя попасть
         в точку B и не тратить на тупики драгоценное время.<br></p>
      <p>Ваша задача - убрать из маршрута тупики при их наличии. Также необходимо сократить одинаковые направления, если они идут друг
         за другом.
      </p>
      <p>Маршрутом считается набор действий. Действие — направление движения и дистанция.</p>
      <p>Тупиком считаются последовательные действия в строго противоположных направлениях движения. Например, если требуется пойти
         <span class="tex-monospace">TOP 50</span> и следующим шагом <span class="tex-monospace">BOTTOM 50</span>, то это считается тупиком, и данные действия можно полностью сократить (тогда в выводе <span style="font-weight:bold;">не</span> должно быть этих строчек). Однако если дистанции не сокращаются полностью, то полностью сократить действия нельзя. Например,
         если требуется пойти <span class="tex-monospace">TOP 50</span>, и следующим шагом <span class="tex-monospace">BOTTOM 40</span>, то это можно сократить в <span class="tex-monospace">TOP 10</span>.<br>Тупиком не считается возвращение в точку маршрута по другой дороге. Например, если требуется пойти <span class="tex-monospace">TOP 50</span>, <span class="tex-monospace">RIGHT 50</span>, <span class="tex-monospace">BOTTOM 50</span>, <span class="tex-monospace">LEFT 50</span>, <span class="tex-monospace">BOTTOM 10</span>, то данные действия сократить до <span class="tex-monospace">BOTTOM 10</span> нельзя.
      </p>
      <p>Пример одинаковых направлений, идущих друг за другом — <span class="tex-monospace">BOTTOM 50</span>, <span class="tex-monospace">BOTTOM 50</span>. Это необходимо сократить в <span class="tex-monospace">BOTTOM 100</span></p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Изначальный маршрут.</p></span><p>В каждой строке действие. Действие — направление <span class="tex-math-text">R</span> и дистанция <span class="tex-math-text">D</span> (0 &lt; D &lt; 10000) в формате "НАПРАВЛЕНИЕ ДИСТАНЦИЯ". Между направлением и дистанцией пробел.
      </p>
      <p>Количество строк <span class="tex-math-text">N</span> (0 &lt; N &lt; 1000).
      </p>
      <p>Дистанции бывают только целыми числами.</p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Обработанный маршрут — без тупиков и с сокращёнными одинаковыми направлениями, если они идут друг за другом.</p></span><p>В каждой строке - действие. Действие — направление <span class="tex-math-text">R</span> и дистанция <span class="tex-math-text">D</span> в формате "НАПРАВЛЕНИЕ ДИСТАНЦИЯ". Между направлением и дистанцией — пробел.
      </p>
      <p>Дистанции бывают только целыми числами.</p>
   </div>
   <h3>Пример 1</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>LEFT 10
TOP 50
BOTTOM 50
TOP 10
</pre></td>
            <td><pre>LEFT 10
TOP 10</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 2</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>TOP 40
RIGHT 10
LEFT 30
BOTTOM 40
</pre></td>
            <td><pre>TOP 40
LEFT 20
BOTTOM 40</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 3</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>TOP 42
LEFT 450
TOP 150
BOTTOM 150
RIGHT 450
LEFT 42
</pre></td>
            <td><pre>TOP 42
LEFT 42</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 4</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>TOP 50
RIGHT 50
BOTTOM 50
LEFT 50
BOTTOM 10
</pre></td>
            <td><pre>TOP 50
RIGHT 50
BOTTOM 50
LEFT 50
BOTTOM 10</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 5</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>TOP 100
TOP 100
</pre></td>
            <td><pre>TOP 200</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 6</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>TOP 100
TOP 100
BOTTOM 150
BOTTOM 150
</pre></td>
            <td><pre>BOTTOM 100</pre></td>
         </tr>
      </tbody>
   </table>
</div></div>