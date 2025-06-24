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

import co.elastic.clients.elasticsearch.core.search.Rescore;
import co.elastic.clients.elasticsearch.core.search.RescoreVariant;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _types.RescorerRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RescorerRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class RescorerRetriever extends RetrieverBase implements RetrieverVariant {
	private final Retriever retriever;

	private final List<Rescore> rescore;

	// ---------------------------------------------------------------------------------------------

	private RescorerRetriever(Builder builder) {
		super(builder);

		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.rescore = ApiTypeHelper.unmodifiableRequired(builder.rescore, this, "rescore");

	}

	public static RescorerRetriever of(Function<Builder, ObjectBuilder<RescorerRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Rescorer;
	}

	/**
	 * Required - Inner retriever.
	 * <p>
	 * API name: {@code retriever}
	 */
	public final Retriever retriever() {
		return this.retriever;
	}

	/**
	 * Required - API name: {@code rescore}
	 */
	public final List<Rescore> rescore() {
		return this.rescore;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("retriever");
		this.retriever.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.rescore)) {
			generator.writeKey("rescore");
			generator.writeStartArray();
			for (Rescore item0 : this.rescore) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RescorerRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RescorerRetriever> {
		private Retriever retriever;

		private List<Rescore> rescore;

		/**
		 * Required - Inner retriever.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Retriever value) {
			this.retriever = value;
			return this;
		}

		/**
		 * Required - Inner retriever.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return this.retriever(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * Required - Inner retriever.
		 * <p>
		 * API name: {@code retriever}
		 */
		public final Builder retriever(RetrieverVariant value) {
			this.retriever = value._toRetriever();
			return this;
		}

		/**
		 * Required - API name: {@code rescore}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rescore</code>.
		 */
		public final Builder rescore(List<Rescore> list) {
			this.rescore = _listAddAll(this.rescore, list);
			return this;
		}

		/**
		 * Required - API name: {@code rescore}
		 * <p>
		 * Adds one or more values to <code>rescore</code>.
		 */
		public final Builder rescore(Rescore value, Rescore... values) {
			this.rescore = _listAdd(this.rescore, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code rescore}
		 * <p>
		 * Adds one or more values to <code>rescore</code>.
		 */
		public final Builder rescore(RescoreVariant value, RescoreVariant... values) {
			this.rescore = _listAdd(this.rescore, value._toRescore());
			for (RescoreVariant v : values) {
				_listAdd(this.rescore, v._toRescore());
			}
			return this;
		}

		/**
		 * Required - API name: {@code rescore}
		 * <p>
		 * Adds a value to <code>rescore</code> using a builder lambda.
		 */
		public final Builder rescore(Function<Rescore.Builder, ObjectBuilder<Rescore>> fn) {
			return rescore(fn.apply(new Rescore.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RescorerRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RescorerRetriever build() {
			_checkSingleUse();

			return new RescorerRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RescorerRetriever}
	 */
	public static final JsonpDeserializer<RescorerRetriever> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RescorerRetriever::setupRescorerRetrieverDeserializer);

	protected static void setupRescorerRetrieverDeserializer(ObjectDeserializer<RescorerRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::rescore, JsonpDeserializer.arrayDeserializer(Rescore._DESERIALIZER), "rescore");

	}

}
