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

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch.snapshot.get.SnapshotResponseItem;
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
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.get.Response
@JsonpDeserializable
public class GetSnapshotResponse implements JsonpSerializable {
	private final List<SnapshotResponseItem> responses;

	private final List<SnapshotInfo> snapshots;

	private final int total;

	private final int remaining;

	// ---------------------------------------------------------------------------------------------

	private GetSnapshotResponse(Builder builder) {

		this.responses = ModelTypeHelper.unmodifiable(builder.responses);
		this.snapshots = ModelTypeHelper.unmodifiable(builder.snapshots);
		this.total = ModelTypeHelper.requireNonNull(builder.total, this, "total");
		this.remaining = ModelTypeHelper.requireNonNull(builder.remaining, this, "remaining");

	}

	public static GetSnapshotResponse of(Function<Builder, ObjectBuilder<GetSnapshotResponse>> fn) {
		return fn.apply(new Builder()).build();
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
	 * Required - The total number of snapshots that match the request when ignoring
	 * size limit or after query parameter.
	 * <p>
	 * API name: {@code total}
	 */
	public final int total() {
		return this.total;
	}

	/**
	 * Required - The number of remaining snapshots that were not returned due to
	 * size limits and that can be fetched by additional requests using the next
	 * field value.
	 * <p>
	 * API name: {@code remaining}
	 */
	public final int remaining() {
		return this.remaining;
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

		if (ModelTypeHelper.isDefined(this.responses)) {
			generator.writeKey("responses");
			generator.writeStartArray();
			for (SnapshotResponseItem item0 : this.responses) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.snapshots)) {
			generator.writeKey("snapshots");
			generator.writeStartArray();
			for (SnapshotInfo item0 : this.snapshots) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("remaining");
		generator.write(this.remaining);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetSnapshotResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetSnapshotResponse> {
		@Nullable
		private List<SnapshotResponseItem> responses;

		@Nullable
		private List<SnapshotInfo> snapshots;

		private Integer total;

		private Integer remaining;

		/**
		 * API name: {@code responses}
		 */
		public final Builder responses(@Nullable List<SnapshotResponseItem> value) {
			this.responses = value;
			return this;
		}

		/**
		 * API name: {@code responses}
		 */
		public final Builder responses(SnapshotResponseItem... value) {
			this.responses = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code responses}
		 */
		@SafeVarargs
		public final Builder responses(
				Function<SnapshotResponseItem.Builder, ObjectBuilder<SnapshotResponseItem>>... fns) {
			this.responses = new ArrayList<>(fns.length);
			for (Function<SnapshotResponseItem.Builder, ObjectBuilder<SnapshotResponseItem>> fn : fns) {
				this.responses.add(fn.apply(new SnapshotResponseItem.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(@Nullable List<SnapshotInfo> value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		public final Builder snapshots(SnapshotInfo... value) {
			this.snapshots = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code snapshots}
		 */
		@SafeVarargs
		public final Builder snapshots(Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>>... fns) {
			this.snapshots = new ArrayList<>(fns.length);
			for (Function<SnapshotInfo.Builder, ObjectBuilder<SnapshotInfo>> fn : fns) {
				this.snapshots.add(fn.apply(new SnapshotInfo.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - The total number of snapshots that match the request when ignoring
		 * size limit or after query parameter.
		 * <p>
		 * API name: {@code total}
		 */
		public final Builder total(int value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - The number of remaining snapshots that were not returned due to
		 * size limits and that can be fetched by additional requests using the next
		 * field value.
		 * <p>
		 * API name: {@code remaining}
		 */
		public final Builder remaining(int value) {
			this.remaining = value;
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
			.lazy(Builder::new, GetSnapshotResponse::setupGetSnapshotResponseDeserializer, Builder::build);

	protected static void setupGetSnapshotResponseDeserializer(DelegatingDeserializer<GetSnapshotResponse.Builder> op) {

		op.add(Builder::responses, JsonpDeserializer.arrayDeserializer(SnapshotResponseItem._DESERIALIZER),
				"responses");
		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(SnapshotInfo._DESERIALIZER), "snapshots");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");
		op.add(Builder::remaining, JsonpDeserializer.integerDeserializer(), "remaining");

	}

}
