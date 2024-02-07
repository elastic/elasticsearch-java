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
import java.lang.Integer;
import java.lang.Long;
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

// typedef: watcher._types.QueryWatch

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.QueryWatch">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryWatch implements JsonpSerializable {
	private final String id;

	@Nullable
	private final WatchStatus status;

	@Nullable
	private final Watch watch;

	@Nullable
	private final Integer primaryTerm;

	@Nullable
	private final Long seqNo;

	// ---------------------------------------------------------------------------------------------

	private QueryWatch(Builder builder) {

		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.status = builder.status;
		this.watch = builder.watch;
		this.primaryTerm = builder.primaryTerm;
		this.seqNo = builder.seqNo;

	}

	public static QueryWatch of(Function<Builder, ObjectBuilder<QueryWatch>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final WatchStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code watch}
	 */
	@Nullable
	public final Watch watch() {
		return this.watch;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public final Integer primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public final Long seqNo() {
		return this.seqNo;
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

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}
		if (this.watch != null) {
			generator.writeKey("watch");
			this.watch.serialize(generator, mapper);

		}
		if (this.primaryTerm != null) {
			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		if (this.seqNo != null) {
			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryWatch}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<QueryWatch> {
		private String id;

		@Nullable
		private WatchStatus status;

		@Nullable
		private Watch watch;

		@Nullable
		private Integer primaryTerm;

		@Nullable
		private Long seqNo;

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable WatchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(Function<WatchStatus.Builder, ObjectBuilder<WatchStatus>> fn) {
			return this.status(fn.apply(new WatchStatus.Builder()).build());
		}

		/**
		 * API name: {@code watch}
		 */
		public final Builder watch(@Nullable Watch value) {
			this.watch = value;
			return this;
		}

		/**
		 * API name: {@code watch}
		 */
		public final Builder watch(Function<Watch.Builder, ObjectBuilder<Watch>> fn) {
			return this.watch(fn.apply(new Watch.Builder()).build());
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public final Builder primaryTerm(@Nullable Integer value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public final Builder seqNo(@Nullable Long value) {
			this.seqNo = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryWatch}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryWatch build() {
			_checkSingleUse();

			return new QueryWatch(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link QueryWatch}
	 */
	public static final JsonpDeserializer<QueryWatch> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			QueryWatch::setupQueryWatchDeserializer);

	protected static void setupQueryWatchDeserializer(ObjectDeserializer<QueryWatch.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::status, WatchStatus._DESERIALIZER, "status");
		op.add(Builder::watch, Watch._DESERIALIZER, "watch");
		op.add(Builder::primaryTerm, JsonpDeserializer.integerDeserializer(), "_primary_term");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");

	}

}
