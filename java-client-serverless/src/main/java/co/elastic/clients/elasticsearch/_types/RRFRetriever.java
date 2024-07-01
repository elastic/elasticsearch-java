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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: _types.RRFRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RRFRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class RRFRetriever extends RetrieverBase implements RetrieverVariant {
	private final List<Retriever> retrievers;

	@Nullable
	private final Integer rankConstant;

	@Nullable
	private final Integer rankWindowSize;

	// ---------------------------------------------------------------------------------------------

	private RRFRetriever(Builder builder) {
		super(builder);

		this.retrievers = ApiTypeHelper.unmodifiableRequired(builder.retrievers, this, "retrievers");
		this.rankConstant = builder.rankConstant;
		this.rankWindowSize = builder.rankWindowSize;

	}

	public static RRFRetriever of(Function<Builder, ObjectBuilder<RRFRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Rrf;
	}

	/**
	 * Required - A list of child retrievers to specify which sets of returned top
	 * documents will have the RRF formula applied to them.
	 * <p>
	 * API name: {@code retrievers}
	 */
	public final List<Retriever> retrievers() {
		return this.retrievers;
	}

	/**
	 * This value determines how much influence documents in individual result sets
	 * per query have over the final ranked result set.
	 * <p>
	 * API name: {@code rank_constant}
	 */
	@Nullable
	public final Integer rankConstant() {
		return this.rankConstant;
	}

	/**
	 * This value determines the size of the individual result sets per query.
	 * <p>
	 * API name: {@code rank_window_size}
	 */
	@Nullable
	public final Integer rankWindowSize() {
		return this.rankWindowSize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.retrievers)) {
			generator.writeKey("retrievers");
			generator.writeStartArray();
			for (Retriever item0 : this.retrievers) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.rankConstant != null) {
			generator.writeKey("rank_constant");
			generator.write(this.rankConstant);

		}
		if (this.rankWindowSize != null) {
			generator.writeKey("rank_window_size");
			generator.write(this.rankWindowSize);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RRFRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder> implements ObjectBuilder<RRFRetriever> {
		private List<Retriever> retrievers;

		@Nullable
		private Integer rankConstant;

		@Nullable
		private Integer rankWindowSize;

		/**
		 * Required - A list of child retrievers to specify which sets of returned top
		 * documents will have the RRF formula applied to them.
		 * <p>
		 * API name: {@code retrievers}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>retrievers</code>.
		 */
		public final Builder retrievers(List<Retriever> list) {
			this.retrievers = _listAddAll(this.retrievers, list);
			return this;
		}

		/**
		 * Required - A list of child retrievers to specify which sets of returned top
		 * documents will have the RRF formula applied to them.
		 * <p>
		 * API name: {@code retrievers}
		 * <p>
		 * Adds one or more values to <code>retrievers</code>.
		 */
		public final Builder retrievers(Retriever value, Retriever... values) {
			this.retrievers = _listAdd(this.retrievers, value, values);
			return this;
		}

		/**
		 * Required - A list of child retrievers to specify which sets of returned top
		 * documents will have the RRF formula applied to them.
		 * <p>
		 * API name: {@code retrievers}
		 * <p>
		 * Adds a value to <code>retrievers</code> using a builder lambda.
		 */
		public final Builder retrievers(Function<Retriever.Builder, ObjectBuilder<Retriever>> fn) {
			return retrievers(fn.apply(new Retriever.Builder()).build());
		}

		/**
		 * This value determines how much influence documents in individual result sets
		 * per query have over the final ranked result set.
		 * <p>
		 * API name: {@code rank_constant}
		 */
		public final Builder rankConstant(@Nullable Integer value) {
			this.rankConstant = value;
			return this;
		}

		/**
		 * This value determines the size of the individual result sets per query.
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
		 * Builds a {@link RRFRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RRFRetriever build() {
			_checkSingleUse();

			return new RRFRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RRFRetriever}
	 */
	public static final JsonpDeserializer<RRFRetriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RRFRetriever::setupRRFRetrieverDeserializer);

	protected static void setupRRFRetrieverDeserializer(ObjectDeserializer<RRFRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::retrievers, JsonpDeserializer.arrayDeserializer(Retriever._DESERIALIZER), "retrievers");
		op.add(Builder::rankConstant, JsonpDeserializer.integerDeserializer(), "rank_constant");
		op.add(Builder::rankWindowSize, JsonpDeserializer.integerDeserializer(), "rank_window_size");

	}

}
