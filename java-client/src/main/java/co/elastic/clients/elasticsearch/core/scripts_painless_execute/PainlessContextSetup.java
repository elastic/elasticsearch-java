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

package co.elastic.clients.elasticsearch.core.scripts_painless_execute;

import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryVariant;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
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

// typedef: _global.scripts_painless_execute.PainlessContextSetup

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.scripts_painless_execute.PainlessContextSetup">API
 *      specification</a>
 */
@JsonpDeserializable
public class PainlessContextSetup implements JsonpSerializable {
	private final JsonData document;

	private final String index;

	@Nullable
	private final Query query;

	// ---------------------------------------------------------------------------------------------

	private PainlessContextSetup(Builder builder) {

		this.document = ApiTypeHelper.requireNonNull(builder.document, this, "document");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.query = builder.query;

	}

	public static PainlessContextSetup of(Function<Builder, ObjectBuilder<PainlessContextSetup>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Document that's temporarily indexed in-memory and accessible from
	 * the script.
	 * <p>
	 * API name: {@code document}
	 */
	public final JsonData document() {
		return this.document;
	}

	/**
	 * Required - Index containing a mapping that's compatible with the indexed
	 * document. You may specify a remote index by prefixing the index with the
	 * remote cluster alias. For example, <code>remote1:my_index</code> indicates
	 * that you want to run the painless script against the &quot;my_index&quot;
	 * index on the &quot;remote1&quot; cluster. This request will be forwarded to
	 * the &quot;remote1&quot; cluster if you have configured a connection to that
	 * remote cluster.
	 * <p>
	 * NOTE: Wildcards are not accepted in the index expression for this endpoint.
	 * The expression <code>*:myindex</code> will return the error &quot;No such
	 * remote cluster&quot; and the expression <code>logs*</code> or
	 * <code>remote1:logs*</code> will return the error &quot;index not found&quot;.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Use this parameter to specify a query for computing a score.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final Query query() {
		return this.query;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("document");
		this.document.serialize(generator, mapper);

		generator.writeKey("index");
		generator.write(this.index);

		if (this.query != null) {
			generator.writeKey("query");
			this.query.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PainlessContextSetup}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PainlessContextSetup> {
		private JsonData document;

		private String index;

		@Nullable
		private Query query;

		public Builder() {
		}
		private Builder(PainlessContextSetup instance) {
			this.document = instance.document;
			this.index = instance.index;
			this.query = instance.query;

		}
		/**
		 * Required - Document that's temporarily indexed in-memory and accessible from
		 * the script.
		 * <p>
		 * API name: {@code document}
		 */
		public final Builder document(JsonData value) {
			this.document = value;
			return this;
		}

		/**
		 * Required - Index containing a mapping that's compatible with the indexed
		 * document. You may specify a remote index by prefixing the index with the
		 * remote cluster alias. For example, <code>remote1:my_index</code> indicates
		 * that you want to run the painless script against the &quot;my_index&quot;
		 * index on the &quot;remote1&quot; cluster. This request will be forwarded to
		 * the &quot;remote1&quot; cluster if you have configured a connection to that
		 * remote cluster.
		 * <p>
		 * NOTE: Wildcards are not accepted in the index expression for this endpoint.
		 * The expression <code>*:myindex</code> will return the error &quot;No such
		 * remote cluster&quot; and the expression <code>logs*</code> or
		 * <code>remote1:logs*</code> will return the error &quot;index not found&quot;.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Use this parameter to specify a query for computing a score.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable Query value) {
			this.query = value;
			return this;
		}

		/**
		 * Use this parameter to specify a query for computing a score.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.query(fn.apply(new Query.Builder()).build());
		}

		/**
		 * Use this parameter to specify a query for computing a score.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(QueryVariant value) {
			this.query = value._toQuery();
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PainlessContextSetup}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PainlessContextSetup build() {
			_checkSingleUse();

			return new PainlessContextSetup(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PainlessContextSetup}
	 */
	public static final JsonpDeserializer<PainlessContextSetup> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PainlessContextSetup::setupPainlessContextSetupDeserializer);

	protected static void setupPainlessContextSetupDeserializer(ObjectDeserializer<PainlessContextSetup.Builder> op) {

		op.add(Builder::document, JsonData._DESERIALIZER, "document");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::query, Query._DESERIALIZER, "query");

	}

}
