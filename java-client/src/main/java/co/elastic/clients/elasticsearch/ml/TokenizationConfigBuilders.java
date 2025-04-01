/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.util.ObjectBuilder;
import java.util.function.Function;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

/**
 * Builders for {@link TokenizationConfig} variants.
 */
public class TokenizationConfigBuilders {
	private TokenizationConfigBuilders() {
	}

	/**
	 * Creates a builder for the {@link NlpBertTokenizationConfig bert}
	 * {@code TokenizationConfig} variant.
	 */
	public static NlpBertTokenizationConfig.Builder bert() {
		return new NlpBertTokenizationConfig.Builder();
	}

	/**
	 * Creates a TokenizationConfig of the {@link NlpBertTokenizationConfig bert}
	 * {@code TokenizationConfig} variant.
	 */
	public static TokenizationConfig bert(
			Function<NlpBertTokenizationConfig.Builder, ObjectBuilder<NlpBertTokenizationConfig>> fn) {
		TokenizationConfig.Builder builder = new TokenizationConfig.Builder();
		builder.bert(fn.apply(new NlpBertTokenizationConfig.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NlpBertTokenizationConfig bert_ja}
	 * {@code TokenizationConfig} variant.
	 */
	public static NlpBertTokenizationConfig.Builder bertJa() {
		return new NlpBertTokenizationConfig.Builder();
	}

	/**
	 * Creates a TokenizationConfig of the {@link NlpBertTokenizationConfig bert_ja}
	 * {@code TokenizationConfig} variant.
	 */
	public static TokenizationConfig bertJa(
			Function<NlpBertTokenizationConfig.Builder, ObjectBuilder<NlpBertTokenizationConfig>> fn) {
		TokenizationConfig.Builder builder = new TokenizationConfig.Builder();
		builder.bertJa(fn.apply(new NlpBertTokenizationConfig.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NlpBertTokenizationConfig mpnet}
	 * {@code TokenizationConfig} variant.
	 */
	public static NlpBertTokenizationConfig.Builder mpnet() {
		return new NlpBertTokenizationConfig.Builder();
	}

	/**
	 * Creates a TokenizationConfig of the {@link NlpBertTokenizationConfig mpnet}
	 * {@code TokenizationConfig} variant.
	 */
	public static TokenizationConfig mpnet(
			Function<NlpBertTokenizationConfig.Builder, ObjectBuilder<NlpBertTokenizationConfig>> fn) {
		TokenizationConfig.Builder builder = new TokenizationConfig.Builder();
		builder.mpnet(fn.apply(new NlpBertTokenizationConfig.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link NlpRobertaTokenizationConfig roberta}
	 * {@code TokenizationConfig} variant.
	 */
	public static NlpRobertaTokenizationConfig.Builder roberta() {
		return new NlpRobertaTokenizationConfig.Builder();
	}

	/**
	 * Creates a TokenizationConfig of the {@link NlpRobertaTokenizationConfig
	 * roberta} {@code TokenizationConfig} variant.
	 */
	public static TokenizationConfig roberta(
			Function<NlpRobertaTokenizationConfig.Builder, ObjectBuilder<NlpRobertaTokenizationConfig>> fn) {
		TokenizationConfig.Builder builder = new TokenizationConfig.Builder();
		builder.roberta(fn.apply(new NlpRobertaTokenizationConfig.Builder()).build());
		return builder.build();
	}

	/**
	 * Creates a builder for the {@link XlmRobertaTokenizationConfig xlm_roberta}
	 * {@code TokenizationConfig} variant.
	 */
	public static XlmRobertaTokenizationConfig.Builder xlmRoberta() {
		return new XlmRobertaTokenizationConfig.Builder();
	}

	/**
	 * Creates a TokenizationConfig of the {@link XlmRobertaTokenizationConfig
	 * xlm_roberta} {@code TokenizationConfig} variant.
	 */
	public static TokenizationConfig xlmRoberta(
			Function<XlmRobertaTokenizationConfig.Builder, ObjectBuilder<XlmRobertaTokenizationConfig>> fn) {
		TokenizationConfig.Builder builder = new TokenizationConfig.Builder();
		builder.xlmRoberta(fn.apply(new XlmRobertaTokenizationConfig.Builder()).build());
		return builder.build();
	}

}
