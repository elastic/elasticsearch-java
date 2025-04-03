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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.OpType;
import co.elastic.clients.elasticsearch._types.Refresh;
import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: watcher._types.IndexAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.IndexAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexAction implements JsonpSerializable {
	private final String index;

	@Nullable
	private final String docId;

	@Nullable
	private final Refresh refresh;

	@Nullable
	private final OpType opType;

	@Nullable
	private final Time timeout;

	@Nullable
	private final String executionTimeField;

	// ---------------------------------------------------------------------------------------------

	private IndexAction(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.docId = builder.docId;
		this.refresh = builder.refresh;
		this.opType = builder.opType;
		this.timeout = builder.timeout;
		this.executionTimeField = builder.executionTimeField;

	}

	public static IndexAction of(Function<Builder, ObjectBuilder<IndexAction>> fn) {
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
	 * API name: {@code op_type}
	 */
	@Nullable
	public final OpType opType() {
		return this.opType;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code execution_time_field}
	 */
	@Nullable
	public final String executionTimeField() {
		return this.executionTimeField;
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
		if (this.opType != null) {
			generator.writeKey("op_type");
			this.opType.serialize(generator, mapper);
		}
		if (this.timeout != null) {
			generator.writeKey("timeout");
			this.timeout.serialize(generator, mapper);

		}
		if (this.executionTimeField != null) {
			generator.writeKey("execution_time_field");
			generator.write(this.executionTimeField);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndexAction> {
		private String index;

		@Nullable
		private String docId;

		@Nullable
		private Refresh refresh;

		@Nullable
		private OpType opType;

		@Nullable
		private Time timeout;

		@Nullable
		private String executionTimeField;

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
		 * API name: {@code op_type}
		 */
		public final Builder opType(@Nullable OpType value) {
			this.opType = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code execution_time_field}
		 */
		public final Builder executionTimeField(@Nullable String value) {
			this.executionTimeField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexAction build() {
			_checkSingleUse();

			return new IndexAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexAction}
	 */
	public static final JsonpDeserializer<IndexAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IndexAction::setupIndexActionDeserializer);

	protected static void setupIndexActionDeserializer(ObjectDeserializer<IndexAction.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::docId, JsonpDeserializer.stringDeserializer(), "doc_id");
		op.add(Builder::refresh, Refresh._DESERIALIZER, "refresh");
		op.add(Builder::opType, OpType._DESERIALIZER, "op_type");
		op.add(Builder::timeout, Time._DESERIALIZER, "timeout");
		op.add(Builder::executionTimeField, JsonpDeserializer.stringDeserializer(), "execution_time_field");

	}

}
