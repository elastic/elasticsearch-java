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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.Index

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/watcher/_types/Actions.ts#L165-L169">API
 *      specification</a>
 */
@JsonpDeserializable
public class Index implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String docId;

	@Nullable
	private final Refresh refresh;

	// ---------------------------------------------------------------------------------------------

	private Index(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.docId = builder.docId;
		this.refresh = builder.refresh;

	}

	public static Index of(Function<Builder, ObjectBuilder<Index>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * API name: {@code doc_id}
	 */
	@Nullable
	public final String docId() {
		return this.docId;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public final Refresh refresh() {
		return this.refresh;
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

		generator.writeKey("index");
		generator.write(this.index);

		if (this.docId != null) {
			generator.writeKey("doc_id");
			generator.write(this.docId);

		}
		if (this.refresh != null) {
			generator.writeKey("refresh");
			this.refresh.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Index}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Index> {
		private String index;

		@Nullable
		private String docId;

		@Nullable
		private Refresh refresh;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code doc_id}
		 */
		public final Builder docId(@Nullable String value) {
			this.docId = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public final Builder refresh(@Nullable Refresh value) {
			this.refresh = value;
			return this;
		}

		/**
		 * Builds a {@link Index}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Index build() {
			_checkSingleUse();

			return new Index(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Index}
	 */
	public static final JsonpDeserializer<Index> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Index::setupIndexDeserializer);

	protected static void setupIndexDeserializer(ObjectDeserializer<Index.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::docId, JsonpDeserializer.stringDeserializer(), "doc_id");
		op.add(Builder::refresh, Refresh._DESERIALIZER, "refresh");

	}

}
