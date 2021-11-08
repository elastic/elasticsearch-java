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

import co.elastic.clients.elasticsearch._types.Result;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.IndexResultSummary
@JsonpDeserializable
public class IndexResultSummary implements JsonpSerializable {
	private final boolean created;

	private final String id;

	private final String index;

	private final Result result;

	private final long version;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	private IndexResultSummary(Builder builder) {

		this.created = ModelTypeHelper.requireNonNull(builder.created, this, "created");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.index = ModelTypeHelper.requireNonNull(builder.index, this, "index");
		this.result = ModelTypeHelper.requireNonNull(builder.result, this, "result");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");
		this.type = builder.type;

	}

	public static IndexResultSummary of(Function<Builder, ObjectBuilder<IndexResultSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code created}
	 */
	public final boolean created() {
		return this.created;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code result}
	 */
	public final Result result() {
		return this.result;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final long version() {
		return this.version;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("result");
		this.result.serialize(generator, mapper);
		generator.writeKey("version");
		generator.write(this.version);

		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexResultSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IndexResultSummary> {
		private Boolean created;

		private String id;

		private String index;

		private Result result;

		private Long version;

		@Nullable
		private String type;

		/**
		 * Required - API name: {@code created}
		 */
		public final Builder created(boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code result}
		 */
		public final Builder result(Result value) {
			this.result = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link IndexResultSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexResultSummary build() {
			_checkSingleUse();

			return new IndexResultSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexResultSummary}
	 */
	public static final JsonpDeserializer<IndexResultSummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexResultSummary::setupIndexResultSummaryDeserializer, Builder::build);

	protected static void setupIndexResultSummaryDeserializer(DelegatingDeserializer<IndexResultSummary.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::result, Result._DESERIALIZER, "result");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}
