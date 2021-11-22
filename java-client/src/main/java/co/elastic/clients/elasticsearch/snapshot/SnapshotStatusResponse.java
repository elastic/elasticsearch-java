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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.status.Response
@JsonpDeserializable
public class SnapshotStatusResponse implements JsonpSerializable {
	private final List<Status> snapshots;

	// ---------------------------------------------------------------------------------------------

	private SnapshotStatusResponse(Builder builder) {

		this.snapshots = ModelTypeHelper.unmodifiableRequired(builder.snapshots, this, "snapshots");

	}

	public static SnapshotStatusResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - API name: {@code snapshots}
	 */
	public final List<Status> snapshots() {
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

		if (ModelTypeHelper.isDefined(this.snapshots)) {
			generator.writeKey("snapshots");
			generator.writeStartArray();
			for (Status item0 : this.snapshots) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SnapshotStatusResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SnapshotStatusResponse> {
		private List<Status> snapshots;

		/**
		 * Required - API name: {@code snapshots}
		 */
		public final Builder snapshots(List<Status> value) {
			this.snapshots = value;
			return this;
		}

		/**
		 * Required - API name: {@code snapshots}
		 */
		public final Builder snapshots(Status... value) {
			this.snapshots = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code snapshots}
		 */
		public final Builder snapshots(Function<ListBuilder<Status, Status.Builder>, ObjectBuilder<List<Status>>> fn) {
			return snapshots(fn.apply(new ListBuilder<>(Status.Builder::new)).build());
		}

		/**
		 * Builds a {@link SnapshotStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SnapshotStatusResponse build() {
			_checkSingleUse();

			return new SnapshotStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SnapshotStatusResponse}
	 */
	public static final JsonpDeserializer<SnapshotStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SnapshotStatusResponse::setupSnapshotStatusResponseDeserializer);

	protected static void setupSnapshotStatusResponseDeserializer(
			ObjectDeserializer<SnapshotStatusResponse.Builder> op) {

		op.add(Builder::snapshots, JsonpDeserializer.arrayDeserializer(Status._DESERIALIZER), "snapshots");

	}

}
