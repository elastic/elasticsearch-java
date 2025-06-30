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

// typedef: _types.PinnedRetriever

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.PinnedRetriever">API
 *      specification</a>
 */
@JsonpDeserializable
public class PinnedRetriever extends RetrieverBase implements RetrieverVariant {
	private final Retriever retriever;

	private final List<String> ids;

	private final List<SpecifiedDocument> docs;

	private final int rankWindowSize;

	// ---------------------------------------------------------------------------------------------

	private PinnedRetriever(Builder builder) {
		super(builder);

		this.retriever = ApiTypeHelper.requireNonNull(builder.retriever, this, "retriever");
		this.ids = ApiTypeHelper.unmodifiable(builder.ids);
		this.docs = ApiTypeHelper.unmodifiable(builder.docs);
		this.rankWindowSize = ApiTypeHelper.requireNonNull(builder.rankWindowSize, this, "rankWindowSize", 0);

	}

	public static PinnedRetriever of(Function<Builder, ObjectBuilder<PinnedRetriever>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Retriever variant kind.
	 */
	@Override
	public Retriever.Kind _retrieverKind() {
		return Retriever.Kind.Pinned;
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
	 * API name: {@code ids}
	 */
	public final List<String> ids() {
		return this.ids;
	}

	/**
	 * API name: {@code docs}
	 */
	public final List<SpecifiedDocument> docs() {
		return this.docs;
	}

	/**
	 * Required - API name: {@code rank_window_size}
	 */
	public final int rankWindowSize() {
		return this.rankWindowSize;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("retriever");
		this.retriever.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.ids)) {
			generator.writeKey("ids");
			generator.writeStartArray();
			for (String item0 : this.ids) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.docs)) {
			generator.writeKey("docs");
			generator.writeStartArray();
			for (SpecifiedDocument item0 : this.docs) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("rank_window_size");
		generator.write(this.rankWindowSize);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PinnedRetriever}.
	 */

	public static class Builder extends RetrieverBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PinnedRetriever> {
		private Retriever retriever;

		@Nullable
		private List<String> ids;

		@Nullable
		private List<SpecifiedDocument> docs;

		private Integer rankWindowSize;

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
		 * API name: {@code ids}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>ids</code>.
		 */
		public final Builder ids(List<String> list) {
			this.ids = _listAddAll(this.ids, list);
			return this;
		}

		/**
		 * API name: {@code ids}
		 * <p>
		 * Adds one or more values to <code>ids</code>.
		 */
		public final Builder ids(String value, String... values) {
			this.ids = _listAdd(this.ids, value, values);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>docs</code>.
		 */
		public final Builder docs(List<SpecifiedDocument> list) {
			this.docs = _listAddAll(this.docs, list);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds one or more values to <code>docs</code>.
		 */
		public final Builder docs(SpecifiedDocument value, SpecifiedDocument... values) {
			this.docs = _listAdd(this.docs, value, values);
			return this;
		}

		/**
		 * API name: {@code docs}
		 * <p>
		 * Adds a value to <code>docs</code> using a builder lambda.
		 */
		public final Builder docs(Function<SpecifiedDocument.Builder, ObjectBuilder<SpecifiedDocument>> fn) {
			return docs(fn.apply(new SpecifiedDocument.Builder()).build());
		}

		/**
		 * Required - API name: {@code rank_window_size}
		 */
		public final Builder rankWindowSize(int value) {
			this.rankWindowSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PinnedRetriever}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PinnedRetriever build() {
			_checkSingleUse();

			return new PinnedRetriever(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PinnedRetriever}
	 */
	public static final JsonpDeserializer<PinnedRetriever> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PinnedRetriever::setupPinnedRetrieverDeserializer);

	protected static void setupPinnedRetrieverDeserializer(ObjectDeserializer<PinnedRetriever.Builder> op) {
		RetrieverBase.setupRetrieverBaseDeserializer(op);
		op.add(Builder::retriever, Retriever._DESERIALIZER, "retriever");
		op.add(Builder::ids, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "ids");
		op.add(Builder::docs, JsonpDeserializer.arrayDeserializer(SpecifiedDocument._DESERIALIZER), "docs");
		op.add(Builder::rankWindowSize, JsonpDeserializer.integerDeserializer(), "rank_window_size");

	}

}
