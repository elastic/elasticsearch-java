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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch.snapshot.get.SnapshotResponseItem;
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

// typedef: snapshot.get.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#snapshot.get.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetSnapshotResponse implements JsonpSerializable {
	private final int remaining;

	private final int total;

	@Nullable
	private final String next;

	private final List<SnapshotResponseItem> responses;

	private final List<SnapshotInfo> snapshots;

	// ---------------------------------------------------------------------------------------------

	private GetSnapshotResponse(Builder builder) {

		this.remaining = ApiTypeHelper.requireNonNullWithDefault(builder.remaining, this, "remaining",
				this.remaining());
		this.total = ApiTypeHelper.requireNonNullWithDefault(builder.total, this, "total", this.total());
		this.next = builder.next;
		this.responses = ApiTypeHelper.unmodifiable(builder.responses);
		this.snapshots = ApiTypeHelper.unmodifiable(builder.snapshots);

	}

	public static GetSnapshotResponse of(Function<Builder, ObjectBuilder<GetSnapshotResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of remaining snapshots that were not returned due to
	 * size limits and that can be fetched by additional requests using the
	 * <code>next</code> field value.
	 * <p>
	 * API name: {@code remaining}
	 */
	public final int remaining() {
		return this.remaining;
	}

	/**
	 * Required - The total number of snapshots that match the request when ignoring
	 * the size limit or <code>after</code> query parameter.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * If the request contained a size limit and there might be more results, a
	 * <code>next</code> field will be added to the response. It can be used as the
	 * <code>after</code> query parameter to fetch additional results.
	 * <p>
	 * API name: {@code next}
	 */
	@Nullable
	public final String next() {
		return this.next;
	}

	/**
	 * API name: {@code responses}
	 */
	public final List<SnapshotResponseItem> responses() {
		return this.responses;
	}

	/**
	 * API name: {@code snapshots}
	 */
	public final List<SnapshotInfo> snapshots() {
		return this.snapshots;
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

		generator.writeKey("remaining");
		generator.write(this.remaining);

		generator.writeKey("total");
		generator.write(this.total);

		if (this.next != null) {
			generator.writeKey("next");
			generator.write(this.next);

		}
		if (ApiTypeHelper.isDefined(this.responses)) {
			generator.writeKey("responses");
			generator.writeStartArray();
			for (SnapshotResponseItem item0 : this.responses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.snapshots)) {
			generator.writeKey("snapshots");
			generator.writeStartArray();
			for (SnapshotInfo item0 : this.snapshots) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSnapshotResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetSnapshotResponse> {
		private Integer remaining;

		private Integer total;

		@Nullable
		private String next;

		@Nullable
		private List<SnapshotResponseItem> responses;

		@Nullable
		private List<SnapshotInfo> snapshots;

		/**
		 * Required - The number of remaining snapshots that were not returned due to
		 * size limits and that can be fetched by additional requests using the
		 * <code>next</code> field value.
		 * <p>
		 * API name: {@code remaining}
		 */
		public final Builder remaining(int value) {
			this.remaining = value;
			return this;
		}

		/**
		 * Required - The total number of snapshots that match the request when ignoring
		 * the size limit or <code>after</code> query parameter.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * If the request contained a size limit and there might be more results, a
		 * <code>next</code> field will be added to the response. It can be used as the
		 * <code>after</code> query parameter to fetch additional results.
		 * <p>
		 * API name: {@code next}
		 */
		public final Builder next(@Nullable String value) {
			this.next = value;
			return this;
		}

		/**
		 * API name: {@code responses}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>responses</code>.
		 */
		public final Builder responses(List<SnapshotResponseItem> list) {
			this.responses = _listAddAll(this.responses, list);
			return this;
		}

		/**
		 * API name: {@code responses}
		 * <p>
		 * Adds one or more values to <code>responses</code>.
		 */
		public final Builder responses(SnapshotResponseItem value, SnapshotResponseItem... values) {
			this.responses = _listAdd(this.responses, value, values);
			return this;
		}

		/**
		 * API name: {@code responses}
		 * <p>
		 * Adds a value to <code>responses</code> using a builder lambda.
		 */
		public final Builder responses(Function<SnapshotResponseItem.Builder, ObjectBuilder<SnapshotResponseItem>> fn) {
			return responses(fn.apply(new SnapshotResponseItem.Builder()).build());
		}

		/**
		 * API name: {@code snapshots}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>snapshots</code>.
		 */
		public final Builder snapshots(List<SnapshotInfo> list) {
			this.snapshots = _listAddAll(this.snapshots, list);
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 * <p>
		 * Adds one or more values to <code>snapshots</code>.
		 */
		public final Builder snapshots(SnapshotInfo value, SnapshotInfo... values) {
			this.snapshots = _listAdd(this.snapshots, value, values);
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 * <p>
		 * Adds a value to <code>snapshots</code> using a builder lambda.
		 */
		public final Builder snapshots(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn) {
			return snapshots(fn.apply(new SnapshotInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetSnapshotResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetSnapshotResponse build() {
			_checkSingleUse();

			return new GetSnapshotResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetSnapshotResponse}
	 */
	public static final JsonpDeserializer<GetSnapshotResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetSnapshotResponse::setupGetSnapshotResponseDeserializer);

	protected static void setupGetSnapshotResponseDeserializer(ObjectDeserializer<GetSnapshotResponse.Builder> op) {

		op.add(Builder::remaining, JsonpDeserializer.integerDeserializer(), "remaining");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::next, JsonpDeserializer.stringDeserializer(), "next");
		op.add(Builder::responses, JsonpDeserializer.arrayDeserializer(SnapshotResponseItem._DESERIALIZER),
				"responses");
		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(SnapshotInfo._DESERIALIZER), "snapshots");

	}

}
