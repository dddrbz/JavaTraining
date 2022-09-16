<div class="problem__statement text" data-bem="{&quot;problem__statement&quot;:{}}">
<div class="problem-statement">
   <div class="header">
      <h1 class="title">A. Баг в библиотеке</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>2&nbsp;секунды</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>256Mb</td>
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
   <div class="legend"> В коде сторонней библиотеки обнаружился баг. Вместо отсортированного массива строк библиотека возвращает массив случайно
      упорядоченных строк. К счастью, в каждую строку в случайной позиции библиотека записывает порядковый индекс – позицию, где
      строка должна быть в выходном массиве, например, "str<span style="font-weight: bold;">2</span>ing". <!--l. 52-->
      <p style="text-indent: 0em;">Ваша задача обработать баг библиотеки и написать функцию, которая:<br>- извлечёт индекс из строки;<br>-
      с помощью индекса расположит строку в нужной позиции. </p>

   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"> Список строк, разделённых символом переноса строки. </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"> Список строк, разделённых символом переноса строки. </div>
   <h2>Пример</h2>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_input i-bem" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать ввод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать ввод"></span></button></div></th>
            <th>Вывод<div class="problem__copy-sample"><button class="button button_theme_pseudo button_size_s button_only-icon_yes problem__copy-button problem__copy-button_type_output i-bem button_js_inited" data-bem="{&quot;button&quot;:{}}" role="button" type="button" title="Скопировать вывод"><span class="button__text">&nbsp;<img class="image button__icon button__icon_role_copy" src="//yastatic.net/lego/_/La6qi18Z8LwgnZdsAr1qy1GwCwo.gif" alt="Скопировать вывод"></span></button></div></th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>str3
1smth
bla2bla</pre></td>
            <td><pre>smth
blabla
str</pre></td>
         </tr>
      </tbody>
   </table>
   <h2>Примечания</h2>
   <div class="notes"> - Индексы всегда начинаются с 1;<br>- последовательность индексов неразрывна, то есть не может быть последовательности [1,2,5];<br>-
      в каждой строке существует лишь одна последовательность чисел, то есть не может быть "st<span style="font-weight: bold;">2</span>ri<span style="font-weight: bold;">3</span>ng";<br>- на вход подаётся не более 10000 строк длиной не более чем 10000 символов. 
   </div>
</div></div>