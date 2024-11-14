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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

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

// typedef: _types.RuleRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RuleRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class RuleRetriever extends RetrieverBase implements RetrieverVariant {
	private final List<String> rulesetIds;

	private final JsonData matchCriteria;

	private final Retriever retriever;

	@Nullable
	private final Integer rankWindowSize;

	// ---------------------------------------------------------------------------------------------

	private RuleRetriever(Builder builder) {
		super(builder);

		this.rulesetIds = ApiTypeHelper.unmodifiableRequired(builder.rulesetIds, this, "rulesetIds");
		this.matchCriteria = ApiTypeHelper.requireNonNull(builder.matchCriteria, this, "matchCriteria");
		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.rankWindowSize = builder.rankWindowSize;

	}

	public static RuleRetriever of(Function<Builder, ObjectBuilder<RuleRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Rule;
	}

	/**
	 * Required - The ruleset IDs containing the rules this retriever is evaluating
	 * against.
	 * <p>
	 * API name: {@code ruleset_ids}
	 */
	public final List<String> rulesetIds() {
		return this.rulesetIds;
	}

	/**
	 * Required - The match criteria that will determine if a rule in the provided
	 * rulesets should be applied.
	 * <p>
	 * API name: {@code match_criteria}
	 */
	public final JsonData matchCriteria() {
		return this.matchCriteria;
	}

	/**
	 * Required - The retriever whose results rules should be applied to.
	 * <p>
	 * API name: {@code retriever}
	 */
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * This value determines the size of the individual result set.
	 * <p>
	 * API name: {@code rank_window_size}
	 */
	@Nullable
	public final Integer rankWindowSize() {
		return this.rankWindowSize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.rulesetIds)) {
			generator.writeKey("ruleset_ids");
			generator.writeStartArray();
			for (String item0 : this.rulesetIds) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		generator.writeKey("match_criteria");
		this.matchCriteria.serialize(generator, mapper);

		generator.writeKey("retriever");
		this.retriever.serialize(generator, mapper);

		if (this.rankWindowSize != null) {
			generator.writeKey("rank_window_size");
			generator.write(this.rankWindowSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RuleRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder> implements ObjectBuilder<RuleRetriever> {
		private List<String> rulesetIds;

		private JsonData matchCriteria;

		private Retriever retriever;

		@Nullable
		private Integer rankWindowSize;

		/**
		 * Required - The ruleset IDs containing the rules this retriever is evaluating
		 * against.
		 * <p>
		 * API name: {@code ruleset_ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rulesetIds</code>.
		 */
		public final Builder rulesetIds(List<String> list) {
			this.rulesetIds = _listAddAll(this.rulesetIds, list);
			return this;
		}

		/**
		 * Required - The ruleset IDs containing the rules this retriever is evaluating
		 * against.
		 * <p>
		 * API name: {@code ruleset_ids}
		 * <p>
		 * Adds one or more values to <code>rulesetIds</code>.
		 */
		public final Builder rulesetIds(String value, String... values) {
			this.rulesetIds = _listAdd(this.rulesetIds, value, values);
			return this;
		}

		/**
		 * Required - The match criteria that will determine if a rule in the provided
		 * rulesets should be applied.
		 * <p>
		 * API name: {@code match_criteria}
		 */
		public final Builder matchCriteria(JsonData value) {
			this.matchCriteria = value;
			return this;
		}

		/**
		 * Required - The retriever whose results rules should be applied to.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * Required - The retriever whose results rules should be applied to.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * This value determines the size of the individual result set.
		 * <p>
		 * API name: {@code rank_window_size}
		 */
		public final Builder rankWindowSize(@Nullable Integer value) {
			this.rankWindowSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RuleRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RuleRetriever build() {
			_checkSingleUse();

			return new RuleRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RuleRetriever}
	 */
	public static final JsonpDeserializer<RuleRetriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RuleRetriever::setupRuleRetrieverDeserializer);

	protected static void setupRuleRetrieverDeserializer(ObjectDeserializer<RuleRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::rulesetIds, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"ruleset_ids");
		op.add(Builder::matchCriteria, JsonData._DESERIALIZER, "match_criteria");
		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::rankWindowSize, JsonpDeserializer.integerDeserializer(), "rank_window_size");

	}

}
